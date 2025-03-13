package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class BBTest extends TestBase {

    @Test
    @DisplayName("Validate Authorisation Form")
    void validateAuthorisationFormTest() {
        open("/");
        $("#cake-TABS_MAIN_REFS div[class = 'h2']")
                .shouldHave(text("Торт на заказ – лучший подарок на любой праздник"));
    }
}
