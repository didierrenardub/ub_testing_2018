package ar.edu.ub.testing2018.Students;

/**
 * Created by drenard on 09/03/2018.
 */
public class CStudentStatistics2018 extends CStudentStatistics
{
    public CStudentStatistics2018()
    {
        IStudent alex = addStudent(new CStudentAlexanderLehmacher());
        IStudent ferr = addStudent(new CStudentFernandoRomero());
        IStudent walt = addStudent(new CStudentWalterDuartes());
        IStudent gabl = addStudent(new CStudentGabrielLozano());
        IStudent gabe = addStudent(new CStudentGabrielEspina());
        IStudent seba = addStudent(new CStudentSebastianWrzesinski());
        IStudent pedr = addStudent(new CStudentPedroRodriguez());

        // Diagnostic
        alex.gradeClass(0, 11, 0, 0, 0, 0, 0, 0);
        ferr.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        walt.gradeClass(0, 100, 0, 0, 0, 0, 0, 0);
        gabl.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        gabe.gradeClass(0, 30, 0, 0, 0, 0, 0, 0);
        seba.gradeClass(0, 0, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(0, 20, 0, 0, 0, 0, 0, 0);

        // Class 1
        alex.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        ferr.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        walt.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        gabl.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        gabe.gradeClass(1, 10, 10, 0, 0, 0, 0, 0);
        seba.gradeClass(1, 1, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(1, 1, 0, 0, 0, 0, 0, 0);

        // Class 2
        alex.gradeClass(2, 10, 10, 10, 10, 10, 10, 6);
        ferr.gradeClass(2, 10, 10, 10, 10, 10, 10, 10);
        walt.gradeClass(2, 10, 10, 10, 10, 10, 10, 10);
        gabl.gradeClass(2, 1, 0, 0, 0, 0, 0, 0);
        gabe.gradeClass(2, 10, 10, 10, 10, 10, 10, 1);
        seba.gradeClass(2, 1, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(2, 10, 10, 10, 10, 0, 0, 1);

        // Class 3
        alex.gradeClass(3, 10, 10, 10, 10, 10, 10, 7);
        ferr.gradeClass(3, 10, 10, 10, 10, 10, 10, 10);
        walt.gradeClass(3, 10, 10, 10, 10, 10, 10, 10);
        gabl.gradeClass(3, 10, 10, 1, 1, 0, 0, 1);
        gabe.gradeClass(3, 10, 10, 10, 10, 10, 10, 10);
        seba.gradeClass(3, 10, 10, 4, 4, 0, 0, 1);
        pedr.gradeClass(3, 1, 0, 10, 10, 0, 0, 1);

        // Class 4
        alex.gradeClass(4, 1, 0, 1, 0, 0, 0, 0);
        ferr.gradeClass(4, 10, 10, 10, 10, 10, 8, 1);
        walt.gradeClass(4, 10, 10, 10, 10, 10, 10, 10);
        gabl.gradeClass(4, 1, 0, 1, 0, 0, 0, 0);
        gabe.gradeClass(4, 10, 10, 10, 10, 10, 8, 8);
        seba.gradeClass(4, 1, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(4, 10, 10, 10, 10, 0, 0, 3);

        // Class 5
        alex.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        ferr.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        walt.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        gabl.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        gabe.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        seba.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
        pedr.gradeClass(5, 0, 0, 0, 0, 0, 0, 0);
    }
}
