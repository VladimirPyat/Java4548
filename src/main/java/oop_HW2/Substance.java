package oop_HW2;

public abstract class Substance {
    private int id;

    public int getId() {
        return id;
    }

    private static int nextId = 0;
    public static class Building extends  Substance implements HasHealth {
        private int id;
        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Building(int maxHealthPoint, int id) {
            this.id=id;
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public Building(int maxHealthPoint) {
           this(maxHealthPoint, nextId++);

        }

        public int getId() {
            return id;
        }
        @Override
        public int getCurrentHealth() {
            return this.currentHealthPoint;
        }

        @Override
        public void setCurrentHealth(int healthPoint) {
            this.currentHealthPoint = healthPoint;
        }

        @Override
        public int getMaxHealth() {
            return this.maxHealthPoint;
        }
    }

    public static class Hero extends  Substance implements HasHealth, HasMana {
        private int id;

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        private int maxManaPoint; // максимально количество магический энергии
        private int currentManaPoint; // текущее количество магический энергии

        public Hero(int maxHealthPoint, int maxManaPoint, int id) {
            this.id=id;
            this.maxHealthPoint = maxHealthPoint;
            this.maxManaPoint = maxManaPoint;

            this.currentHealthPoint = maxHealthPoint;
            this.currentManaPoint = maxManaPoint;
        }

        public Hero(int maxHealthPoint, int maxManaPoint) {
            this(maxHealthPoint, maxManaPoint, nextId++);

        }

        public int getId() {
            return id;
        }

        @Override
        public int getCurrentHealth() {
            return this.currentHealthPoint;
        }

        @Override
        public void setCurrentHealth(int healthPoint) {
            this.currentHealthPoint = healthPoint;
        }

        @Override
        public int getMaxHealth() {
            return this.maxHealthPoint;
        }

        @Override
        public int getCurrentMana() {
            return this.currentManaPoint;
        }

        @Override
        public void setCurrentMana(int manaPoint) {
            this.currentManaPoint = manaPoint;
        }

        @Override
        public int getMaxMana() {
            return this.maxManaPoint;
        }
    }

    public static class Neutral extends  Substance implements HasHealth {
        private int id;

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Neutral(int maxHealthPoint, int id) {
            this.id=id;
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public Neutral(int maxHealthPoint) {
            this(maxHealthPoint, nextId++);
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }


        public int getId() {
            return id;
        }
        @Override
        public int getCurrentHealth() {
            return this.currentHealthPoint;
        }

        @Override
        public void setCurrentHealth(int healthPoint) {
            this.currentHealthPoint = healthPoint;
        }

        @Override
        public int getMaxHealth() {
            return this.maxHealthPoint;
        }

    }
}
