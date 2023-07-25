@regression
Feature: Computer page Test
  As user I want to Computer page into Nop commerce website

  Background: I am on homepage
    And I Click on Computer tab

  @smoke
  Scenario: Verify user should navigate to computer page successfully
    When  I Should see the Computer Text 'Computer'
    Then I Should navigate to Computer page successfully

  @sanity
  Scenario: Verify user should navigate to Desktops page successfully
    When I Click on Desktops link
    And I Should see the Desktops Text 'Desktops'
    Then I Should navigate to Desktops page successfully

  @regression
  Scenario Outline: Verify that user should Build You Own Computer and add them to cart successfully
    When I Click on Desktops link
    And Click on product name Build your own computer
    And  I Select processor "<Processor>"
    And I Select RAM "<Ram>"
    And I  Select HDD "<HDD>"
    And I Select OS "<OS>"
    And I Select Software "<Software>"
    And I Click on ADD TO CART Button
    And I Verify message "<Result>"
    Then I should Product add to card is successfully
    Examples:
      | Processor                                       | Ram           | HDD               | OS                      | Software                   | Result                                           |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   | The product has been added to your shopping cart |