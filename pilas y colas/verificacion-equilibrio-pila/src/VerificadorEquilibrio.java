public class VerificadorEquilibrio {

        public boolean esEquilibrada(String expresion) {
            Pila pila = new Pila();

            for (char c : expresion.toCharArray()) {

                // Símbolo de apertura → apilar
                if (c == '(' || c == '[' || c == '{') {
                    pila.push(c);

                    // Símbolo de cierre → verificar correspondencia
                } else if (c == ')' || c == ']' || c == '}') {

                    if (pila.isEmpty()) return false;

                    char tope = pila.pop();

                    if (!corresponde(tope, c)) return false;
                }
            }

            // Si la pila quedó vacía, todo fue cerrado correctamente
            return pila.isEmpty();
        }

        private boolean corresponde(char apertura, char cierre) {
            return (apertura == '(' && cierre == ')')
                    || (apertura == '[' && cierre == ']')
                    || (apertura == '{' && cierre == '}');
        }
    }
