package com.develogical;

public class QueryProcessor {

  boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
 
        if (n == 2 || n == 3)
            return true;
 
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }

  String extractInt(String str)
    {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^0-9]", " "); // regular expression
 
        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");
 
        if (str.equals(""))
            return "-1";
 
        return str;
    }

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }
    else if(query.toLowerCase().contains("name")) {
      return "Rakshit Gl";
    }
    else if(query.toLowerCase().contains("age")) {
      return "I am 24 year old! Got years of tech ahead of me- and I hope this is the start of something great!";
    }
    else if(query.toLowerCase().contains("location") || query.toLowerCase().contains("stay") || query.toLowerCase().contains("work")
    || query.toLowerCase().contains("job") || query.toLowerCase().contains("career")) {
      return "I am working at Deutsche Bank- which ensures I remain pinned in Pune. (P.S. I belong to Karnataka, India and love exploring new cities in India!)";
    }
    else if(query.toLowerCase().contains("hobby") || query.toLowerCase().contains("passtime") || query.toLowerCase().contains("fun")) {
      return "I love competitive coding, listening to hip-hop music and vibing with fun people around me!";
    }

    else if(query.toLowerCase().contains("largest")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }

      float largest = -1;
      for(Float item: items) {
        if(item == null)
          continue;
        if(item > largest) {
          largest = item;
        }
      }

      return Math.round(largest) + "";
    }
    else if(query.toLowerCase().contains("plus")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }
      float sum = 0;
      for(Float item: items) {
        if(item == null)
          continue;
        sum += item;
      }
      return Math.round(sum) + "";
    }
    else if(query.toLowerCase().contains("minus")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }
      float sum = 0;
      for(Float item: items) {
        if(item == null)
          continue;
        if(sum == 0) {
          sum = item;
        }
        else
          sum -= item;
      }
      return Math.round(sum) + "";
    }
    else if(query.toLowerCase().contains("multipl")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }
      float product = 1;
      for(Float item: items) {
        if(item == null)
          continue;
        product *= item;
      }
      return Math.round(product) + "";
    }
    else if(query.toLowerCase().contains("square") && query.toLowerCase().contains("cube")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }
      
      String res = "";
      for(Float item: items) {
        if(item == null)
          continue;
        if (Math.pow((int)Math.sqrt(item), 2) == item
                && Math.pow((int)Math.cbrt(item), 3) == item) {
                res += (Math.round(item)) + ", ";
            }
      }
      return res.substring(0, res.length()-2);
    }

    else if(query.toLowerCase().contains("prime")) {
      String fin = extractInt(query);
      String[] arr = fin.split(" ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.parseFloat(item);
        }
        catch(Exception e) {

        }
      }

      String res = "";
      for(Float item: items) {
        if(item == null)
          continue;
        int itemInt = Math.round(item);
        if(isPrime(itemInt)) {
          res += itemInt + ", ";
        }
      }

      return res.substring(0, res.length()-2);
    }

    return "Oops! I did not know that, could you hit me up with a new query?";
  }
}
