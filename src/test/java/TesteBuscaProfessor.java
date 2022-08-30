import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    @Test
    public void testeBuscaHorarioProfessor(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor saldanha = horarioProfessor.horarioProfessores(10);

        assertEquals("17h30", saldanha.getHorario());

    }


    @Test
    public void testeBuscaHorarioErrado(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor saldanha = horarioProfessor.horarioProfessores(10);

        assertEquals("10h30", saldanha.getHorario());

    }

    @Test
    public void testeBuscaNomeProfessor(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor egidio = horarioProfessor.horarioProfessores(20);

        assertEquals("Egidio",  egidio.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaNomeErrado(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor egidio = horarioProfessor.horarioProfessores(20);

        assertEquals("Saldanha",  egidio.getNomeDoProfessor());

    }

    @Test
    public void testeBuscaPeriodoProfessor(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor egidio = horarioProfessor.horarioProfessores(20);

        assertEquals("diurno",  egidio.getPeriodo());

    }

    @Test
    public void testeBuscaPeriodoErrado(){
        ProfessorService service = new MockProfessorService();
        HorarioProfessores horarioProfessor = new HorarioProfessores(service);

        Professor egidio = horarioProfessor.horarioProfessores(20);

        assertEquals("noturno",  egidio.getPeriodo());

    }

}
