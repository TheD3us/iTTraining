import { Formateur } from "./formateur";
import { Formation} from "./formation";


export class Module {
<<<<<<< HEAD
    public id: number | undefined;
=======
    public id: number;
>>>>>>> 16e153f3859b5daeff356c767d267be414d57f8b
    public nom: string;
    public formateur: Formateur;
    public note: number;
    public listeModule: Module;
}