(ns problem14)

(def test-cases
  '[(= __ ((fn add-five [x] (+ x 5)) 3))
    (= __ ((fn [x] (+ x 5)) 3))
    (= __ (#(+ % 5) 3))
    (= __ ((partial + 5) 3))])

(def __
  8
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
