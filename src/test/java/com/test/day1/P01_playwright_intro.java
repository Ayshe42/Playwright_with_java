package com.test.day1;

import com.microsoft.playwright.*;

public class P01_playwright_intro {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
       // Thread.sleep(1000);
        page.close();
        browser.close();
    }
}