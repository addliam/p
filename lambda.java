 
 
//          Obtener el sueldo menor
        Double menor = listaEmpleados.stream()
                .min(Comparator.comparing(Empleado::getSalario)).get().getSalario();
        
        System.out.println("Sueldo menor: "+menor);
 
 
//          Obtener el sueldo mayor
        Double mayor = listaEmpleados.stream()
                .max(Comparator.comparing(Empleado::getSalario)).get().getSalario();
        
        System.out.println("Sueldo mayor: "+mayor);
 
 
//          Obtener el promedio de sueldos de los empleados que su nombre termina con la letra "a"
        List<Empleado> terminaA = listaEmpleados.stream()
                .filter(e -> e.getNombre().endsWith("a")).toList();        
        //terminaA.forEach(t->System.out.println(t.getNombre()));
        Double suma = terminaA.stream().reduce(0d, (a,i)-> a+i.getSalario(), Double::sum);
        Integer cantidad = terminaA.size();
        
        Double promedio = suma/cantidad;
        System.out.println("Promedio que su nombre termina en 'a': " + promedio);
 
 
//          Obtener la suma de sueldos de los que su nombre comienda con "M"
        System.out.format("\nSuma de sueldos que su nombre empieza con M: %.2f\n", listaEmpleados.stream()
                .filter(e -> e.getNombre().startsWith("M"))
                .reduce(0d, (a,i)-> a+i.getSalario(), Double::sum)
        );        
//          Obtener la cantidad de empleados que tienen un sueldo menor a 5550.00
        
        Integer empls = listaEmpleados.stream()
                .filter(e -> e.getSalario() < 5550d )
                .toList().size();
        
        System.out.println("Empleados que ganan menos de 5550: "+empls);