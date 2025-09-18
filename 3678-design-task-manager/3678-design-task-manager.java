class TaskManager {
    public static class Task {
        int userId, taskId, priority;

        public Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> {
        return a.priority == b.priority ? b.taskId - a.taskId : b.priority - a.priority;
    });

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> t : tasks) {
            Task task = new Task(t.get(0), t.get(1), t.get(2));
            pq.offer(task);
            taskMap.put(task.taskId, task);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        pq.offer(task);
        taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            Task tp = new Task(task.userId, task.taskId, newPriority);
            taskMap.put(tp.taskId, tp);
            pq.offer(tp);
        }

    }

    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }

    public int execTop() {

        while (!pq.isEmpty()) {
            Task top = pq.poll();
            Task curr = taskMap.get(top.taskId);
            if (curr == top) {
                taskMap.remove(top.taskId);
                return top.userId;
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */