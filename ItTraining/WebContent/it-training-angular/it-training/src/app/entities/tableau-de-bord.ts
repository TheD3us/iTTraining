import { Formation } from "./formation";
import { Evaluation } from "./evaluation";

export class TableauDeBord {
    public formation: Formation;
    public evaluation: Evaluation;
    public noteAccueil: number;
    public noteEnvironement: number;
    public noteAccueil: number;
    public noteModule: number;
    public noteFormation: number;
    public noteContenuModule: number;
    public noteFormateur: number;
    public notePedagogieFormateur: number;
    public noteMaitriseSujetFormateur: number;
    public noteDisponibiliteFormateur: number;
    public noteReponseFormateur: number;
    public noteAnimationFormateur: number;
    public noteSatisfaction: number;
    public resultatRecommandation: boolean;
    public resultatProjetFormation: number;
}

