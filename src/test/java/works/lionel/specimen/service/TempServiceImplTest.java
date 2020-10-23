package works.lionel.specimen.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import works.lionel.specimen.controller.TempController;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TempServiceImplTest {

    TempController tempController;

    @Mock
    TempService tempService;

    @BeforeEach
    void setUp(){
        tempController = new TempController(tempService);
    }


    @Test
    void testAdd(){
        Integer x = 6;
        Integer y = 5;
        when(tempService.add(x, y))
                .thenReturn(Math.addExact(x, y));
        Number actual = tempController.getSum(x, y);

        assertEquals(11, actual);
    }
}