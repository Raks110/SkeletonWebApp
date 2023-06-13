package com.develogical;

public class QueryProcessor {

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
      String que = query.substring(query.indexOf(":"));
      que = que.trim();
      String[] arr = que.split(", ");
      Float[] items = new Float[arr.length];
      int index = 0;
      for(String item: arr) {
        try {
          items[index++] = Float.valueOf(item);
        }
        catch(Exception e) {
          System.out.println(e.getMessage());
        }
      }

      float largest = -1;
      for(float item: items) {
        if(item > largest) {
          largest = item;
        }
      }

      return "The largest item is: " + largest + ".";
    }

    return "Oops! I did not know that, could you hit me up with a new query?";
  }
}
