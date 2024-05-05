public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amplified = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            amplified[i] = a[i] * alpha;
        }
        return amplified;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] reversed = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - 1 - i];
        }
        return reversed;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        return merged;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int maxLength = Math.max(a.length, b.length);
        double[] mixed = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            double aValue = (i < a.length) ? a[i] : 0;
            double bValue = (i < b.length) ? b[i] : 0;
            mixed[i] = aValue + bValue;
        }
        return mixed;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int newLength = (int) (a.length / alpha);
        double[] changedSpeed = new double[newLength];
        for (int i = 0; i < newLength; i++) {
            changedSpeed[i] = a[(int) (i * alpha)];
        }
        return changedSpeed;
    }

    public static void main(String[] args) {
        // Read WAV files
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");

        // Apply audio effects
        double[] ampBeatbox = amplify(beatbox, 1.5);
        double[] reversedBuzzer = reverse(buzzer);
        double[] mergedChimesCow = merge(chimes, cow);
        double[] mixedDialupBeatbox = mix(dialup, beatbox);
        double[] speedChangedBuzzer = changeSpeed(buzzer, 0.5);

        // Create collage by merging all tracks
        double[] collage = merge(ampBeatbox, reversedBuzzer);
        collage = merge(collage, mergedChimesCow);
        collage = merge(collage, mixedDialupBeatbox);
        collage = merge(collage, speedChangedBuzzer);

        // Play collage
        StdAudio.play(collage);
    }
}
