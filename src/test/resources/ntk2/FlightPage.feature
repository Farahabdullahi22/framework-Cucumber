Feature: Flight Purchase page

  Scenario Outline: Verify User able to Purchase Flight
    Given User navigates to purchase Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<firstLastField>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User etners State "<state>"
    And User  etners ZipCode "<zipCode>"
    And User  etners CreditCardNumber "<creditCardNumber>"
    And User etners Month "<monthField>"
    And User  etners Year "<yearField>"
    And User enters nameOnCard "<nameOnCardField>"
    And User clicks rememberMe
    And User clicks purchaseButton
    Then User verifies success message "<message>"

    Examples: 
      | firstLastField | address         | city        | state      | zipCode | creditCardNumber | monthField | yearField | nameOnCardField | message                            |
      | Jay Ab         | 222 Dolphins Ln | Fishers     | Indiana    |    5714 |       5553336661 |          4 |      2000 | Jay Ab          | Thank you for your purchase today! |
      | Ali  Db        | 333 Dolphins Mn | Indiapolis  | Albama     |    5888 |       4442227772 |          5 |      2001 | Ali Db          | Thank you for your purchase today! |
      | Gary  Gy       | 444 Dolphins Pn | Noblisvile  | Alaska     |    8888 |       6663338883 |          6 |      2002 | Gary Gy         | Thank you for your purchase today! |
      | Medina Md      | 555 Dolphins Kn | Carmel      | Arizona    |    1488 |       7774449994 |          7 |      2003 | Median Md       | Thank you for your purchase today! |
      | Yasir Ys       | 666 Dolphins Hn | Zionizville | California |    5887 |       8885556666 |          8 |      2004 | Yasir Ys        | Thank you for your purchase today! |
      | John  Js       | 777 Dolphins An | Mundy       | Colorado   |    5882 |       9996667785 |          9 |      2005 | John Jh         | Thank you for your purchase today! |
