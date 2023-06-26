import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CardTest {
    @Test
    public void shouldTestCard(){
        Selenide.open("http://localhost:9999/");
        SelenideElement form = $("form");
        form.$("[data-test-id=name] input").setValue("Ширгин Александр");
        form.$("[data-test-id=phone] input").setValue("+79814750000");
        form.$("[data-test-id=agreement]").click();
        form.$("button").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
        sleep(5000);




    }
}
