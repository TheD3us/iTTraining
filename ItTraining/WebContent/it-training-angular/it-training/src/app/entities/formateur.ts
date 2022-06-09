import { Adresse } from "./adresse";
import { Personne } from "./personne";
import { Module } from "./module";
import { Machine } from "./machine";

export class Formateur extends Personne {
    private id: number;
    private module: Module;
    private machine: Machine;
}