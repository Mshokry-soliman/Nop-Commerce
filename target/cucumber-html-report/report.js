$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Automated E2E Tests",
  "description": "",
  "id": "automated-e2e-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "He search for \"\u003cproductName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose to buy two items",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "moves to checkout cart and enter personal details on check outpage and place the order",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he can view the order and download the invoice",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "productName"
      ],
      "line": 11,
      "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Apple MacBook Pro 13-inch"
      ],
      "line": 12,
      "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "He search for \"Apple MacBook Pro 13-inch\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "choose to buy two items",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "moves to checkout cart and enter personal details on check outpage and place the order",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he can view the order and download the invoice",
  "keyword": "Then "
});
formatter.match({
  "location": "End2End_Test.user_is_in_Home_page()"
});
formatter.result({
  "duration": 745819611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 15
    }
  ],
  "location": "End2End_Test.he_search_for(String)"
});
formatter.result({
  "duration": 4391482910,
  "status": "passed"
});
formatter.match({
  "location": "End2End_Test.choose_to_buy_two_items()"
});
formatter.result({
  "duration": 2742501695,
  "status": "passed"
});
formatter.match({
  "location": "End2End_Test.moves_to_checkout_cart_and_enter_personal_details_on_check_outpage_and_place_the_order()"
});
formatter.result({
  "duration": 8475840997,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#BillingNewAddress_FirstName\"}\n  (Session info: chrome\u003d85.0.4183.83)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAHMOUD\u0027, ip: \u0027192.168.100.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\Mahmoud\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49440}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7ac755f450b339a4bd65f74b2db89183\n*** Element info: {Using\u003did, value\u003dBillingNewAddress_FirstName}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy25.sendKeys(Unknown Source)\r\n\tat pages.PageBase.setElementText(PageBase.java:34)\r\n\tat pages.CheckOutPage.CheckoutProduct(CheckOutPage.java:130)\r\n\tat steps.End2End_Test.moves_to_checkout_cart_and_enter_personal_details_on_check_outpage_and_place_the_order(End2End_Test.java:48)\r\n\tat ✽.And moves to checkout cart and enter personal details on check outpage and place the order(End2End_Test.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "End2End_Test.he_can_view_the_order_and_download_the_invoice()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": " I want to check that the user can register in our e-commerce website.",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cemail\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password"
      ],
      "line": 12,
      "id": "user-registration;user-registration;;1"
    },
    {
      "cells": [
        "ahmed",
        "mohamed",
        "ahmed1@user434.com",
        "12345678"
      ],
      "line": 13,
      "id": "user-registration;user-registration;;2"
    },
    {
      "cells": [
        "Moataz",
        "ahmed",
        "test1@newuser233.com",
        "87654321"
      ],
      "line": 14,
      "id": "user-registration;user-registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"ahmed\" , \"mohamed\" , \"ahmed1@user434.com\" , \"12345678\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 1633718800,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "duration": 26412761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ahmed",
      "offset": 11
    },
    {
      "val": "mohamed",
      "offset": 21
    },
    {
      "val": "ahmed1@user434.com",
      "offset": 33
    },
    {
      "val": "12345678",
      "offset": 56
    }
  ],
  "location": "UserRegistration.i_entered(String,String,String,String)"
});
formatter.result({
  "duration": 2360291231,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_successfully()"
});
formatter.result({
  "duration": 2188612015,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"Moataz\" , \"ahmed\" , \"test1@newuser233.com\" , \"87654321\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 784877761,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "duration": 10672359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Moataz",
      "offset": 11
    },
    {
      "val": "ahmed",
      "offset": 22
    },
    {
      "val": "test1@newuser233.com",
      "offset": 32
    },
    {
      "val": "87654321",
      "offset": 57
    }
  ],
  "location": "UserRegistration.i_entered(String,String,String,String)"
});
formatter.result({
  "duration": 2818488280,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_successfully()"
});
formatter.result({
  "duration": 859912573,
  "status": "passed"
});
});