package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class App 
{
    public static void main( String[] args )
    {
    
        List<Empleado> empleadoList = new ArrayList<>();

        Empleado emp1 = Empleado.builder()
            .nombre("Ivan")
            .primerApellido("Reina")
            .segundoApellido("Galvez")
            .genero(Genero.HOMBRE)
            .departamento(Departamento.CONTABILIDAD)
            .salario(1400.34)
            .build();
        
        empleadoList.add(emp1);

        Empleado emp2 = Empleado.builder()
            .nombre("Jose")
            .primerApellido("Reina")
            .segundoApellido("Galvez")
            .genero(Genero.HOMBRE)
            .departamento(Departamento.PROFESORADO)
            .salario(1600.4)
            .build();

        empleadoList.add(emp2);

        Empleado emp3 = Empleado.builder()
            .nombre("Isabel")
            .primerApellido("Galvez")
            .segundoApellido("Amado")
            .genero(Genero.MUJER)
            .departamento(Departamento.RRHH)
            .salario(1200.74)
            .build();

        empleadoList.add(emp3);

        Empleado emp4 = Empleado.builder()
            .nombre("Laura")
            .primerApellido("Escanes")
            .segundoApellido("Salamanca")
            .genero(Genero.MUJER)
            .departamento(Departamento.PROFESORADO)
            .salario(1600.4)
            .build();

        empleadoList.add(emp4);

        OptionalDouble odPromedioSalario = empleadoList.stream()
        .mapToDouble((Object value) -> ((Empleado) value).getSalario()).average();
        
        Double promedioSalario = 0.0;
        if(odPromedioSalario.isPresent()) {
            promedioSalario = odPromedioSalario.getAsDouble();
        }

        System.out.println("El salario promedio es: " + promedioSalario);
        for (Empleado empleadoItem : empleadoList) {
            if(empleadoItem.getGenero().equals(Genero.MUJER)
                && empleadoItem.getSalario() > promedioSalario)
                System.out.println(empleadoItem.toString());
        }

        List<? super Persona> listPersonasVariadas = new ArrayList<>();
        listPersonasVariadas.addAll(empleadoList);

        Estudiante est1 = Estudiante.builder()
            .nombre("Roberto")
            .primerApellido("Ruiz")
            .segundoApellido("Garcia")
            .genero(Genero.OTRO)
            .facultad(Facultad.FISICA)
            .totalAsignaturasMatriculadas(7)
            .build();

        listPersonasVariadas.add(est1);

        Estudiante est2 = Estudiante.builder()
            .nombre("Pedro")
            .primerApellido("Sanchez")
            .segundoApellido("Pesoe")
            .genero(Genero.HOMBRE)
            .facultad(Facultad.INFORMATICA)
            .totalAsignaturasMatriculadas(14)
            .build();

        listPersonasVariadas.add(est2);

        Estudiante est3 = Estudiante.builder()
            .nombre("Sandra")
            .primerApellido("Ruiz")
            .segundoApellido("Garcia")
            .genero(Genero.MUJER)
            .facultad(Facultad.MEDICINA)
            .totalAsignaturasMatriculadas(4)
            .build();

        listPersonasVariadas.add(est3);

        Estudiante est4 = Estudiante.builder()
            .nombre("Samuel")
            .primerApellido("Lorca")
            .segundoApellido("Galapagos")
            .genero(Genero.OTRO)
            .facultad(Facultad.ADE)
            .totalAsignaturasMatriculadas(6)
            .build();

        listPersonasVariadas.add(est4);
        
    }
}
