import { Test } from "./test";
import { Apprenant } from "./apprenant";
import { Formateur } from "./formateur";
import { Salle } from "./salle";
import { Module } from "./module";


export class Formation  {
    public id: number;
    public nom: string;
<<<<<<< HEAD
    public module: string;
=======
    public module: Module;
>>>>>>> 16e153f3859b5daeff356c767d267be414d57f8b
    public dateDebut: Date;
    public dateDefin: Date;
    public niveau: string;
    public test: Test;
    public apprenant: Apprenant;
    public salle: Salle;
    public formateur: Formateur;
<<<<<<< HEAD
    //private theme:string;
    //private sousTheme:string;
=======
    //public theme:string;
    //public sousTheme:string;
>>>>>>> 16e153f3859b5daeff356c767d267be414d57f8b
}