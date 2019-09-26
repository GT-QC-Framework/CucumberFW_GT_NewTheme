@LogInPage
Feature: Test Login
    As an automation tester
  I want to login success
  So that I want to verify all fields is correct message

  Background: User to navigate to Login page
    Given I navigate to newtheme web payment "https://pay.zing.vn/wplogin/mobile/cdkm"

  @Login_By_FaceBook
  Scenario: Verify direct screen login by facebook
    Given I click icon FaceBook

  @Login_By_Zalo
  Scenario: Verify direct screen login by zalo
    Given I click icon Zalo

  @Login_By_Google
  Scenario: Verify direct screen login by google
    Given I click icon Google

  @Login_By_Email
  Scenario: Verify direct screen login by email
    Given I click icon Email

  @TC_01_Input_invalid_account_email
  Scenario Outline: Login incorrect account, login and verify login not successfully
    Given I click option Email
    When I input data "<UserName>" to username
    And I input data "<PassWord>" to password
    And i click button Dang Nhap
    Then Verify successfully with message "<Message>"

    Examples: 
      | UserName                | PassWord      | Message                              |
      |                         |               | Vui lòng nhập email bảo vệ tài khoản |
      | nhutvipprono1@gmail.com |               | Vui lòng nhập mật khẩu               |
      |                         | nhutvipprono1 | Vui lòng nhập email bảo vệ tài khoản |
      | cassiopeia@gmail.com    | tvxqno1       | Thông tin đăng nhập không chính xác  |

  @TC_02_Input_valid_account
  Scenario: Login correct account, login and verify login not successfully
    Given I click login by email
    When I input username
    And I input  password
    And i click button Login
    And Verify successfully with title "360mobi Cung Đình Kế"
    Then I click Thoat account

  @TC_03_Input_invalid_account_ZingID
  Scenario Outline: Login incorrect account ZingID
    Given I input "<UserName>" to username
    When I input "<PassWord>" to password
    And i click Dang Nhap
    Then Verify successful with message "<Message>"

    Examples: 
      | UserName    | PassWord    | Message                             |
      |             |             | Vui lòng nhập tài khoản ZingID      |
      | giindbskno1 |             | Vui lòng nhập mật khẩu              |
      |             | giindbskno1 | Vui lòng nhập tài khoản ZingID      |
      | cassiopeia  | tvxqno1!    | Thông tin đăng nhập không chính xác |

  @TC_04_Input_valid_account_ZingID
  Scenario: Login correct account
    Given I sendkey username
    When I sendkey pass
    And I  click Login
    And Verify login success with title "360mobi Cung Đình Kế | Pay.zing.vn - Cổng thanh toán game chính thức của VNG"
    Then I logout success

  @TC_05_select_role_success
  Scenario: Select role successfully
    Given I type username
    When I tye password
    And I  Login
    And I select role
    And I click chon nhan vat nay
