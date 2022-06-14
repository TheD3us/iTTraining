import { Formateur } from "./formateur";
import { Formation} from "./formation";


export class Module {

    public id: number;
    public nom: string;
    public formateur: Formateur;
    public note: number;
    public listeModule: Module;
}