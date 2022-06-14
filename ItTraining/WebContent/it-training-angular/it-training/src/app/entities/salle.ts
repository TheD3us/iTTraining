import { Adresse } from "./adresse";
import { Machine } from "./machine";


//A voir si on se fait une clase de type "base-entities" comme on avait fait avec Pierre-Luc pour l'id, si oui mettre un extends
export class Salle {
    public id: number;
    public nomSalle: string;
    public adresse: Adresse;
    public machine: Machine;

}