package com.ohgiraffers.section05.custom;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 만들기
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@EnabledOnOs(OS.WINDOWS)
@Test
public @interface WindowsTest {
}
