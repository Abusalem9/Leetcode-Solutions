public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for (String str : strs) {
            s.append(str).append("π");
        }
        return s.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] d = s.split("π", -1);
        return new ArrayList<>(Arrays.asList(d).subList(0, d.length - 1));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));