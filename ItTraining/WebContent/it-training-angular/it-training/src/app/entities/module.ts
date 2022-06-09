import { Formateur } from "./formateur";
import { Formation} from "./formation";


export class Module extends Formateur {
    private id: number;
    private nom: string;
    private formateur: Formateur;
    private note: number;
    private listeModule: Module;
}