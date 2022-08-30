public class MockProfessorService implements ProfessorService {

    @Override
    public String busca(int id) {

        if(id == 10){
            return ProfessorConst.SALDANHA;
        }

        if(id == 20){
            return ProfessorConst.EGIDIO;
        }

        return null;

    }

}
