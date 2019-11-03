package me.jdragon.jenkins_maven_exam;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author choijaeyong on 2019/11/03.
 * @project jenkins_maven_exam
 * @description
 */
public class test01 {

  @Test
  public void test() {
    String str = "abc";
    assertThat("abc").isEqualTo(str);
  }

}
