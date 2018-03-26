(ns problem107)

(def test-cases
  '[(= 256 ((__ 2) 16),
       ((__ 8) 2))
    (= [1 8 27 64] (map (__ 3) [1 2 3 4]))
    (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))])

(def __
  (fn [n] (fn [x] (apply * (repeat n x))))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
