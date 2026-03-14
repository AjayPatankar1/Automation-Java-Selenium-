E-commerce Test Cases

| Test Case ID | Scenario                    | Steps                                                     | Expected Result                                                   | Type      |
| ------------ | --------------------------- | --------------------------------------------------------- | ----------------------------------------------------------------- | --------- |
| TC01         | Valid Login                 | Enter valid email/mobile and password → Click Login       | User should login successfully                                    | Positive  |
| TC02         | Invalid Password            | Enter valid username and wrong password                   | Error message should appear                                       | Negative  |
| TC03         | Empty Login Fields          | Leave username and password empty → Click Login           | Validation message should appear                                  | Negative  |
| TC04         | Invalid Email Format        | Enter email like `abc123`                                 | System should show invalid email format error                     | Edge Case |
| TC05         | Search Valid Product        | Enter "Laptop" in search bar → Click search               | Relevant products should appear                                   | Positive  |
| TC06         | Search Non Existing Product | Search `abcdxyz123`                                       | "No results found" message should appear                          | Negative  |
| TC07         | Empty Search                | Click search without entering text                        | System should show suggestions or prevent search                  | Edge Case |
| TC08         | Add Product to Cart         | Select product → Click Add to Cart                        | Product should be added to cart                                   | Positive  |
| TC09         | Add Same Product Twice      | Add same product multiple times                           | Quantity should increase correctly                                | Edge Case |
| TC10         | Checkout Successfully       | Add product → Go to cart → Click Checkout → Enter details | Order confirmation should appear                                  | Positive  |
| TC11         | Checkout Without Address    | Proceed to checkout without entering address              | Validation error should appear                                    | Negative  |
| TC12         | Logout                      | Click logout after login                                  | User should be redirected to login page                           | Positive  |
| TC13         | Very Long Search Input      | Enter very long text in search bar                        | System should handle input without crashing                       | Edge Case |
| TC14         | Add Out of Stock Product    | Try adding out-of-stock product to cart                   | System should display "Out of Stock" message                      | Negative  |
| TC15         | Rapid Add to Cart Click     | Click Add to Cart button multiple times quickly           | System should handle quantity correctly without duplication error | Edge Case |


Automation Scope (using Selenium)

Automated Test Cases:
TC01 - Login
TC05 - Product Search
TC08 - Add to Cart
TC10 - Checkout Flow
TC12 - Logout
