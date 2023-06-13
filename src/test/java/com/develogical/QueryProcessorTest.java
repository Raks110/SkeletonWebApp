package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process(""), containsString("query"));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsAboutName() throws Exception {
    assertThat(queryProcessor.process("name"), containsString("Rakshit"));
  }

  @Test
  public void knowsAboutAge() throws Exception {
    assertThat(queryProcessor.process("age"), containsString("24"));
  }

  @Test
  public void knowsAboutHobby() throws Exception {
    assertThat(queryProcessor.process("hobby"), containsString("hip-hop"));
  }

  @Test
  public void knowsAboutWork() throws Exception {
    assertThat(queryProcessor.process("work"), containsString("Deutsche Bank"));
  }

  @Test
  public void knowsAboutPlace() throws Exception {
    assertThat(queryProcessor.process("location"), containsString("Pune"));
  }
}
