package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

  @Override
  protected void writeContentTo(PrintWriter writer) {
    writer.println(
        "<h1>Welcome to Rakshit's Page (hang on, as of now this page does absolutely nothing)!</h1>"
            + "<p>Please enter your query in the box below: "
            + "<form><input type=\"text\" name=\"q\" />"
            + "<input type=\"submit\">"
            + "</form>"
            + "</p>");
  }
}
