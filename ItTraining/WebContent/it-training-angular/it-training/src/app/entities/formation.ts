import { Test } from "./test";
import { Apprenant } from "./apprenant";
import { Formateur } from "./formateur";
import { Salle } from "./salle";
import { Module } from "./module";


export class Formation extends personne {
    private id: number;
    private nom: string;
    private module: string;
    private dteDebut: Date;
    private dteDefin: Date;
    private niveau: string;
    private test: Test;
    private apprenant: Apprenant;
    private salle: Salle;
    private formateur: Formateur;
    //private theme:string;
    //private sousTheme:string;
}