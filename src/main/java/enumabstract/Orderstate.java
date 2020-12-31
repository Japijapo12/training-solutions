package enumabstract;

public enum Orderstate implements Deletable {

    NEW {
        @Override
        public boolean canDelete() {
            return true;
        }
    },
    CONFIRMED {
        @Override
        public boolean canDelete() {
            return true;
        }
    },
    PREPARED {
        @Override
        public boolean canDelete() {
            return true;
        }
    },
    ONBOARD {
        @Override
        public boolean canDelete() {
            return false;
        }
    },
    DELIVERED {
        @Override
        public boolean canDelete() {
            return false;
        }
    },
    RETURNED {
        @Override
        public boolean canDelete() {
            return false;
        }
    },
    DELETED {
        @Override
        public boolean canDelete() {
            return false;
        }
    }

}
