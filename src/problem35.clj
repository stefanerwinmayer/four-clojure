(ns problem35)

(def test-cases
  '[(= __ (let [x 5] (+ 2 x)))
    (= __ (let [x 3, y 10] (- y x)))
    (= __ (let [x 21] (let [y 3] (/ x y))))])

(def __
  7
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
