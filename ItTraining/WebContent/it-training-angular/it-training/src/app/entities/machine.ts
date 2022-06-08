import { Apprenant } from "./apprenant";


//A voir si on se fait une clase de type "base-entities" comme on avait fait avec Pierre-Luc pour l'id, si oui mettre un extends
export class Machine {
    public id: number;
    public codeIdentification: number;
    public marque: string;
    public modele: string;
    public apprennant: Apprenant;

}