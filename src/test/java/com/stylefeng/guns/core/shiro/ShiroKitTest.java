package com.stylefeng.guns.core.shiro;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShiroKitTest {

    @Test
    public void md5() {
        System.out.println(ShiroKit.md5("123456","8pgby"));
        System.out.println(new SimpleHash("MD5", "123456", "8pgby", 1024).toString());
    }
}