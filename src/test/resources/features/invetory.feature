   @69onelove
  Feature: Sales manager should be able create and modify product

    Background:
      Given the user is on login page


    Scenario: Login as a sales manager
      When sales manager enters login credentials
      Then sales manager click on one of the options

      Scenario: Sales managers goes to invetory and add product
        When  sales manager click on invetory module
        Then  sales manager clicks on products
        And sales manager clicks on create button product creation window appeared
        When sales manager give expected name "Toyota Corolla" click save btn
        Then expected name must be the same with actual product name







