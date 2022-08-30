import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HorarioProfessores {

    ProfessorService professorService;

    public HorarioProfessores(ProfessorService professorService){
        this.professorService = professorService;
    }

    public Professor horarioProfessores(int id) {

        String professorJson = professorService.busca(id);

        // Convertendo a string inimigoJson para um JsonObject
        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horario").getAsString(),
                jsonObject.get("periodo").getAsString());

    }

}
