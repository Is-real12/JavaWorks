package Reflection;

public class Problem {

        private String name;
        private ProblemsType type;
        private boolean isSolved;

        public Problem(String name, ProblemsType type) {
            this.name = name;
            this.type = type;
            this.isSolved = false;
        }

        public String getName() {
            return name;
        }

        public ProblemsType getType() {
            return type;
        }

        public boolean isSolved() {
            return isSolved;
        }

        public void setSolved(boolean solved) {
            isSolved = solved;
        }
    }


