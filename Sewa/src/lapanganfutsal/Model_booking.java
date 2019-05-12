/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lapanganfutsal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ardy Sendleep
 */
public class Model_booking {

  
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_booking(){
        
        getTabel().addColumn("Kode Booking");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Waktu");
        getTabel().addColumn("Nama Pemesan");
        getTabel().addColumn("Nama Team");
        getTabel().addColumn("No Handphone");
       
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
     
}

