import { Test } from "./test";
import { Apprenant } from "./apprenant";
import { Formateur } from "./formateur";
import { Salle } from "./salle";
import { Module } from "./module";


export class Formation  {
    public id: number;
    public nom: string;
    public module: Module;
    public dateDeDebut: Date;
    public dateDeFin: Date;
    public niveau: string;
    public test: Test;
    public apprenant: Apprenant[];
    public salle: Salle;
    public formateur: Formateur;

    //private theme:string;
    //private sousTheme:string;

}