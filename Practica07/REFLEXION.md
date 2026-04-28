# Reflexion

## 1. Checked vs unchecked

Las checked exceptions deben manejarse obligatoriamente con try-catch o throws.

Las unchecked exceptions no necesitan manejo obligatorio.


## 2. Jerarquia de excepciones

Cree una jerarquia para organizar mejor los errores.

Es mejor que usar Exception directamente porque cada error tiene un significado diferente.


## 3. Try-with-resources

Es mejor que usar finally porque cierra automaticamente los recursos.

Hace el codigo mas limpio y evita errores.