(ns problem145)

(def test-cases
  '[(= __ (for [x (range 40)
                :when (= 1 (rem x 4))]
            x))
    (= __ (for [x (iterate #(+ 4 %) 0)
                :let [z (inc x)]
                :while (< z 40)]
            z))
    (= __ (for [[x y] (partition 2 (range 20))]
            (+ x y)))])

(def __
  (range 1 40 4)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
