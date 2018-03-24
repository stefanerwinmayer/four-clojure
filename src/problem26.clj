(ns problem26)

(def test-cases
  '[(= (__ 3) '(1 1 2))
    (= (__ 6) '(1 1 2 3 5 8))
    (= (__ 8) '(1 1 2 3 5 8 13 21))])

(def __
  #(take % (map first (iterate
                        (fn [[a b]] [b (+ a b)])
                        [1 1])))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
