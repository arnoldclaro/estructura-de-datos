public class InversorCadena {

        public String invertir(String texto) {
            Pila pila = new Pila();

            // Paso 1: apilar cada carácter
            for (char c : texto.toCharArray()) {
                pila.push(c);
            }

            // Paso 2: desapilar para construir la cadena invertida
            StringBuilder resultado = new StringBuilder();
            while (!pila.isEmpty()) {
                resultado.append(pila.pop());
            }

            return resultado.toString();
        }
    }
