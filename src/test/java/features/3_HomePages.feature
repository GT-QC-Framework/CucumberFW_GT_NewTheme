@HomePagePayment
Feature: Test Payment
    As an automation tester
  I want to pay success
  So that I want to payment all method

  Background: Navigate webpayment select package
    Given I navigate to payment "https://pay.zing.vn/product/cdkm/package"
    Then I select random package
    And I click Chon goi

  @TC_01_Select_MeThod_ZaloPay
  Scenario: Select method zalopay
    Given I click method ZaloPay
    When I click chon cach thanh toan ZaloPay
    And Verify so tien thanh toan
    And I click nap bang Zalopay
    Then I click kiem tra ket qua giao dich
    
 @TC_02_Select_Method_ZingCard
  Scenario Outline: Select method Zing Card
    Given I click method ZingCard
    When i type "<Serial>" to serial
    And i type "<PinCode>" to pincode
    And I click chon cach thanh toan Zing Card
    And Verify message  "<Message1>" and "<Message2>"
    Then I click nap bang Zing Card

    Examples: 
      | Serial       | PinCode   | Message1                  | Message2             |
      |              |           | Vui lòng nhập số seri thẻ | Vui lòng nhập mã thẻ |
      | db1176217110 |           |                           | Vui lòng nhập mã thẻ |
      |              | 1a2b3c4d5 | Vui lòng nhập số seri thẻ |                      |
      | 1a2b3c4d5e6f | 1a2b3c4d5 | Số seri thẻ không hợp lệ  |                      |
      | 9c0066488202 | nyl8mh687 |                           |                      |
    
  

 