public class startWord {
  public String startWord(String str, String word) {
    int len = word.length();
    if (len <= str.length() && str.substring(1, len).equals(word.substring(1, len))) {
      return str.charAt(0) + word.substring(1, len);
    } else {
      return "";
    }
  }
}
