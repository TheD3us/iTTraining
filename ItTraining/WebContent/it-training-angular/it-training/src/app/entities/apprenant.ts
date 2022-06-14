import { Adresse } from "./adresse";
import { Personne } from "./personne";
import { Module } from "./module";
import { Machine } from "./machine";
import { Formation } from "./formation";
//import { Entreprise } from "./entreprise";

export class Apprenant extends Personne {
    public id: number;
    private candidatAccepte: boolean;
    private formation: Formation;
    private machine: Machine;
    private entreprise: Entreprise;
}