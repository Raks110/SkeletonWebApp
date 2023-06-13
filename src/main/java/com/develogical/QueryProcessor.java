package com.develogical;

public class QueryProcessor {

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
      return "Hi! My name is Rakshit Gl and I love experimenting with code, data and everything tech!";
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

      return largest + "";
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
      return res;
    }

    return "Oops! I did not know that, could you hit me up with a new query?";
  }
}
