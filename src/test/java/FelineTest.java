import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {
    @Mock
    Animal animal;


    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedMeat);
        Feline feline = new Feline();
        List<String> actualMeat = feline.eatMeat();
        assertEquals(actualMeat, expectedMeat);
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 1;
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
}