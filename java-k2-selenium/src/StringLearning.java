public class StringLearning {
  public static void main(String[] args) {
    String myPasswordStr = "123myPassword";
    String wrongPasswordStr = "123456";
    char[] allCharacters = wrongPasswordStr.toCharArray();
    int totalUpperCase = 0;
    int totalLowerCase = 0;
    int totalDigit = 0;
    for (char character : allCharacters) {
      if (Character.isDigit(character))
        totalDigit++;
      if(Character.isLowerCase(character))
        totalLowerCase++;
      if (Character.isUpperCase(character))
        totalUpperCase++;
    }
    if(totalDigit == 0 || totalLowerCase == 0 || totalUpperCase == 0){
      System.out.println("Your password is not correct format!");

    }else {
      System.out.println("You are all set!");
    }
    // Replacement
    String badwordsContainer = "bad something else....bad";
    String filteredString = badwordsContainer.replace("bad", "***");
    String filteredStringFirst = badwordsContainer.replaceFirst("bad","***");
    System.out.println(filteredStringFirst);
    System.out.println(filteredString);

    // Trim | remove empty spaces at beginning and ending
    String withEmptySpacesStr = " abc ";
    System.out.println(" Array length: " + withEmptySpacesStr.length());
    System.out.println(withEmptySpacesStr.trim().length());

    // Substring, indexOf....split
    String url = "https://google.com";

    // Tra ve index cua chu m lan dau tien neu khong se tra ve mot con so < 0
    System.out.println(url.indexOf("m"));
    System.out.println(url.indexOf("x"));
    System.out.println(url.indexOf("google"));

    // Sub-str
    String myName = "Le Thu";
    System.out.println(myName.substring(0,2));
    System.out.println(url.substring(0, 6));
    System.out.println(url.substring(8, 14)); //8: inclusive (start), 14: exclusive (limit)

    // Split
    for (String s : url.split(":")) {
      System.out.println(s);
    }
    // simple Regex
    String myCookTimes = "105 mins  ";
   String myCookTimesStr= myCookTimes.replaceAll("[^0-9]", "");
    System.out.println(myCookTimesStr);
    int myCookTimeInt = Integer.parseInt(myCookTimesStr);
    System.out.println(myCookTimeInt + 1);

    // concat
    String s1 = "Le";
    String s2 = "Thu";
    System.out.println(s1 + s2);
    System.out.println(s1.concat(s2));
  }
}
