

import org.example.ApplicationConsole;
import org.example.TaskManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TaskManagerTest {

    @Test
    public void menuTest_add(){
        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("1")
                .thenReturn("toto")
                .thenReturn("list")
                .thenReturn("exit");

        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(1)).message("1 toto false");
    }

    @Test
    void menuTest_delete() {

        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("1")
                .thenReturn("toto")
                .thenReturn("add")
                .thenReturn("2")
                .thenReturn("tata")
                .thenReturn("delete")
                .thenReturn("1")
                .thenReturn("list")
                .thenReturn("exit");

        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(2)).message("2 tata false");
        verify(applicationConsoleMock, times(1)).message("1 toto false");
//        Assertions.assertEquals(1, target.taskListe.getTaskList().size());

    }

    @Test
    void menuTest_delete_none_task() {

        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("delete");


        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(1)).message("pas de tasks !");

    }

    @Test
    void meunTest_update() {
        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("1")
                .thenReturn("toto")
                .thenReturn("update")
                .thenReturn("1")
                .thenReturn("list")
                .thenReturn("exit");


        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(1)).message("1 toto true");

    }
}